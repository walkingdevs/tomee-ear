## Structure

7 sub-modules. Simple and boring:
- persistence - Separate module just for JPA persistence.xml
- ejb - Don't want to say this phrase, but "Business Logic" layer
- deploy - Mostly there is need for a basic Data
- web - The WEB
- rs - The Restful or Not, but HTTP API
- libs - It's HARD to include libs in EAR project, so separate module
- ear - Finally EAR.

## Testing

Dev profile:

    mvn clean test

Staging|Prod profile:

    docker run -d --name postgres postgres
    docker run --rm -it -v $PWD:/src -w /src --link postgres walkingdevs/mvn mvn clean test -Pstaging|prod
    docker rm -f postgres

## Running the whole EAR

Dev profile:

    mvn clean package -DskipTests && mvn -f ear tomee:run

Staging|Prod profile:

    docker run -d --name postgres postgres
    docker run --rm -it -v $PWD:/src -w /src --link postgres walkingdevs/mvn mvn clean package -DskipTests -Pstaging|prod && mvn -f ear tomee:run
    docker rm -f postgres

## Shipping

Dev profile:

    mvn clean install -DskipTests && mvn -f ear tomee:exec
    docker build --rm -t app ear

Staging|Prod profile:

    mvn clean install -DskipTests -Pstaging|prod && mvn -f ear tomee:exec
    docker build --rm -t app ear

## Params
    
    web root /
    rs root  /rs
    Binding  0.0.0.0
    Port     8080
    
    http://localhost:8080

## Jrebel

    mvn clean package && mvn tomee:run -Prebel

CLI:

    # Awesome changes...
    mvn compile

IDEA:
    
    # Awesome changes...
    Build->Make project

Look at console, see message?, done.