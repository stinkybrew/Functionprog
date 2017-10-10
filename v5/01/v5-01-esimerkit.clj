;-----
;; valid forms
1
"a string"
["a" "vector" "of" "strings"]

;-----
;; general form of operations. This won't actually run because
;; operator, operand1, etc aren't bound
(operator operand1 operand2 ... operandn)

;-----
;; Example operations
(+ 1 2 3)
; => 6

;-----
(str "It was the panda " "in the library " "with a dust buster")
; => "It was the panda in the library with a dust buster"


;-----
(= [1 2 3] [1, 2, 3])
;=> true

;----- map
{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

;----- vector
(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)
; => {:name "Pugsley Winterbottom"}

;----- lists
(nth '(:a :b :c) 2)
; => :c

;----- sets
(list 1 "two" {3 4})
; => (1 "two" {3 4})

(set [3 3 3 4 4])
; => #{3 4}

(contains? #{:a :b} :a)
; => true

;-----
'(a b :name 12.5)       ;; list

['a 'b :name 12.5]      ;; vector

{:name "Chas" :age 31}  ;; map

#{1 2 3}                ;; set


;-----
(defn hypot
  [x y]
  (let [x2 (* x x)
        y2 (* y y)]
    (Math/sqrt (+ x2 y2))))


;-----
(def v [42 "foo" 99.2 [5 12]])

;-----
(first v)
;=> 42
(second v)   
;=> "foo"
(last v)     
;=> [5 12]
(nth v 2)
;=> 99.2
(v 2)
;=> 99.2
(.get v 2)
;=> 99.2


;-----
(let [x 8]
  (+ 10 x))
;=> 18
