# GYM DATA BASE

## BUSINESS PLAN

1. Exclusive system for use in Argentina.
1. Network management of exclusive gyms for registered people.
1. There are 3 types of subscription: Silver - Gold - Platinum. Each subscription has a group of affiliated gyms.
1. Each gym will have its administrative staff.
1. Trainers will be able to work in as many gyms as they want.
1. Each activity will have a schedule and an associate professor.
1. If the client stops paying for their subscription, they will not have access to the gym network.



## ENTITY RELATIONSHIP MODEL

![ERD](https://github.com/GabRom98/Proyecto_RedGimnasios/assets/101473902/1efa8a6e-8ea8-4473-9845-b488e13b1106)



## ENDPOINTS

| Método   |   Route                                          | Descripción                                                   |
|----------|--------------------------------------------------|---------------------------------------------------------------|
| GET      |  /api/users                                      | Get All Users                                                 |
| GET      |  /api/users/{id}                                 | Get one User                                                  |
| POST     |  /api/users                                      | Register one User                                             |
| PUT      |  /api/users                                      | Update one User                                               |
| PUT      |  /api/user-active/{id}                           | Update one User                                               |
| GET      |  /api/gimnasio/suscriptionstypes/{id}            | Get a Suscription Type                                        |
| GET      |  /api/gimnasio/suscriptionstypes                 | Get All Suscriptions Types                                    |
| POST     |  /api/gimnasio/suscriptionstypes                 | Register one Suscription Type                                 |
| PUT      |  /api/gimnasio/suscriptionstypes/{id}            | Update one Suscription Type                                   |
| DELETE   |  /api/gimnasio/suscriptions                      | Delete one Suscription Type                                   |
| GET      |  /api/gimnasio/suscriptions/{userID}             | Get one Suscription                                           |
| GET      |  /api/gimnasio/suscriptions                      | Get All Suscriptions                                          |
| POST     |  /api/gimnasio/suscriptions                      | Register one Suscription                                      |
| PUT      |  /api/gimnasio/suscriptions                      | Update one Suscription                                        |
| DELETE   |  /api/gimnasio/suscriptions/{userID}             | Delete one Suscription                                        |
| PUT      |  /api/gimnasio/suscriptions/{userID}/true        | Update one Suscription                                        |
| PUT      |  /api/gimnasio/suscriptions/{userID}/false       | Update one Suscription                                        |
| GET      |  /api/roles                                      | Get All Roles                                                 |
| GET      |  /api/roles/{id}                                 | Get one Role                                                  |
| POST     |  /api/roles                                      | Register one Role                                             |
| PUT      |  /api/roles                                      | Update one Role                                               |
| DELETE   |  /api/roles/{id}                                 | Delete one Role                                               |
| GET      |  /api/gimnasio/province/                         | Get All Provinces                                             |
| GET      |  /api/gimnasio/province/{id}                     | Get one Province                                              |
| POST     |  /api/gimnasio/province                          | Register one Provinces                                        |
| DELETE   |  /api/gimnasio/province/{id}                     | Update one Provinces                                          |
| GET      |  /api/gymActivities/                             | Get All Gym Activities                                        |
| GET      |  /api/gymActivities/{id}                         | Get one Gym Activity                                          |
| GET      |  /api/gymActivities/{idGym}                      | Get Gym Activities by Gym Id                                  |
| POST     |  /api/gymActivities/                             | Register one User                                             |
| PUT      |  /api/gymActivities/{id}                         | Update one Gym Activity                                       |
| DELETE   |  /api/gymActivities/{id}                         | Delete one Gym Activity                                       |
| POST     |  /api/login/                                     | Log In                                                        |
| GET      |  /api/gimnasio/address                           | Get All Address                                               |
| POST     |  /api/gimnasio/address                           | Register one Address                                          |
| GET      |  /api/gimnasio/address{id}                       | Get one Address                                               |
| DELETE   |  /api/gimnasio/address{id}                       | Delete one Address                                            |
| GET      |  /api/gimnasio/activity                          | Get All Activities                                            |
| POST     |  /api/gimnasio/activity                          | Register one Activitie                                        |
| GET      |  /api/gimnasio/activity/{id}                     | Get one Activitie                                             |
| DELETE   |  /api/gimnasio/activity/{id}                     | Delete one Activitie                                          |



