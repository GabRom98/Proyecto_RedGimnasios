# GYM DATA BASE

## BUSINESS PLAN

1. Exclusive system for use in Argentina.
1. Network management of exclusive gyms for registered people.
1. There are 3 types of subscription: Silver - Gold - Platinum. Each subscription has a group of affiliated gyms.
1. Each gym will have its administrative staff.
1. Trainers will be able to work in as many gyms as they want.
1. Each activity will have a schedule and an associate professor.
1. If the client stops paying for their subscription, they will not have access to the gym network.



## ENTITY RELATIONSHIP

1. A **schedule** have many **days** (_1_M_)
1. A **schedule** have many **times** (_1_M_)
1. A **customer** make one **suscription** (_1_1_)
1. Many **traineers** have many **schedule** and many **activities** (_M_M_)
1. Many **traineer** have many **roles** (_M_M_)
1. Many **gyms** have many **traineers** (_M_M_)
1. A **gym** have one **address** (_1_1_)
1. A **address** have one **provinces** (_1_1_)
1. A **gym** have many **administratives** (_1_M_)
1. A **suscription** have one **suscription_type** (_1_1_)
1. A **suscription** have one **customer** (_1_1_)
1. A **customer** have one **login** (_1_1_)



## ENTITY RELATIONSHIP MODEL

![ERD](https://github.com/GabRom98/Proyecto_RedGimnasios/assets/101473902/ba52d529-a4e7-4bfb-b41e-0a24b17691b6)



## ENDPOINTS

| Método   |   Route                | Descripción                                  |
|----------|------------------------|----------------------------------------------|
| GET      |  /api/users            | Get All Users                                |
| GET      |  /api/users/{id}       | Get a User                                   |
| POST     |  /api/users            | Register a User                              |
| PUT      |  /api/users            | Update a User                                |
| PUT      |  /api/user-active/{id} | Actualiza datos en el servidor.              |
| DELETE   |  /api/users/{id}       | Delete a User                                |



