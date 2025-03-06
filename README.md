# Decola Tech 2025
Java RESTful API criada para a Decola Tech Avanade

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String id
        +String name
        +String password
        +String birthday
        +List<Game> gamesList
    }

    class Game {
        +String id
        +String name
        +String icon
        +String description
        +String type
        +String platform
    }

    class Rating {
        +String gameId
        +Double stars
    }

    User "1" -- "N" Game : plays
    User "1" -- "N" Rating : rates
    Game "1" -- "1" Rating : has
```
