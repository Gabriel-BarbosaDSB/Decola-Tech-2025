# Decola Tech 2025
Java RESTful API criada para a Decola Tech Avanade

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +Int id
        +String name
        +String username
        +String password
        +String icon
    }

    class List {
        +Int id
        +Int gameId
    }

    class Game {
        +Int id
        +String name
        +String icon
        +String description
    }

    class Rating {
        +Int id
        +Int gameId
        +Int stars
    }

    User "1" -- "1" List : has
    User "N" -- "N" Rating : rates
    List "1" -- "1" Game : contains
```
