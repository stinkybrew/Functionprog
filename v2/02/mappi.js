'use strict';

const user1 = {nimi: 'Jukka'};
const user2 = {nimi: 'Jose'};
const user3 = {nimi: 'Joonas'};

const userRoles = new Map();

userRoles.set (user1, 'Admin');

userRoles
        .set (user2, 'User')  // Voi myös ketjuttaa
        .set (user3, 'User');
        

console.log(userRoles.get(user1)); // Admin

console.log(userRoles.has(user2)); // true

userRoles.set(user2, 'Admin');  // rooli korvautuu

console.log(userRoles.get(user1)); // Admin

for (let user of userRoles.keys()){
    console.log(user.nimi);  // Jukka, Jose, Joonas
}

for (let role of userRoles.values()){
    console.log(role);  // Admin, Admin, User
}

for (let ur of userRoles.entries()){
    console.log(`${ur[0].nimi}: ${ur[1]}`);  // Admin, Admin, User
}

/*
for(let [user, role] of userRoles){  //destructuring
    console.log(`${user.nimi}: ${role}`);  // Admin, Admin, User
}
*/












