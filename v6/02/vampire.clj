(def vampire-database
   {0 {:makes-blood-puns? false, :has-pulse? true  :name "McFishwich"}
    1 {:makes-blood-puns? false, :has-pulse? true  :name "McMackson"}
    2 {:makes-blood-puns? true,  :has-pulse? false :name "Damon Salvatore"}
    3 {:makes-blood-puns? true,  :has-pulse? true  :name "Mickey Mouse"}})


(defn vampire-related-details
   [social-security-number]
   (Thread/sleep 1000) 
   (get vampire-database social-security-number))

; (vampire-related-details 2)

(defn vampire?
    	[record]
    		(and (:makes-blood-puns? record)
     			 (not (:has-pulse? record))
         		 record))

; (if (vampire? (vampire-related-details 2)) (println "on vampyyri"))

(defn identify-vampire
   		[social-security-numbers]
   		(first (filter vampire?
                  (map vampire-related-details social-security-numbers))))

;  (identify-vampire [ 1 2 3 4])

(time (vampire-related-details 0))

; => "Elapsed time: 1001.261948 msecs"
; => {:makes-blood-puns? false, :has-pulse? true, :name "McFishwich"}

 (time (def mapped-details (map vampire-related-details (range 0 1000000))))
 
;=>  "Elapsed time: 7.688537 msecs"
;=> #'vampire.core/mapped-details

(time (first mapped-details))
 ; => "Elapsed time: 32030.767 msecs"
 ; => {:name "McFishwich", :makes-blood-puns? false, :has-pulse? true}

(time (first mapped-details))

;=> "Elapsed time: 32006.945789 msecs"
;=> {:makes-blood-puns? false, :has-pulse? true, :name "McFishwich"}

(time (first mapped-details)) ; toka kerta

;=> "Elapsed time: 0.05978 msecs"
;=> {:makes-blood-puns? false, :has-pulse? true, :name "McFishwich"}

(time (identify-vampire (range 0 10000)))
; => "Elapsed time: 32003.78371 msecs"
; => {:makes-blood-puns? true, :has-pulse? false, :name "Damon Salvatore"}

