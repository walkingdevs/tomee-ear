[![Build Status](https://travis-ci.org/walkingdevs/tomee-ear.svg?branch=master)](https://travis-ci.org/walkingdevs/tomee-ear)
[![Download](https://api.bintray.com/packages/walkingdevs/mvn/tomee-ear/images/download.svg) ](https://bintray.com/walkingdevs/mvn/tomee-ear/_latestVersion)

## What is it?
- Generic JEE 7 template based on TomEE 7
- Profiles dev|staging|prod

## Structure

7 sub-modules. Simple and boring:
- persistence - Separate module just for JPA persistence.xml
- ejb - Don't want to say this phrase, but "Business Logic" layer
- deploy - Mostly there is need for a basic Data
- web - The WEB
- rs - The Restful or Not, but HTTP API
- libs - It's HARD to include libs in EAR project, so separate module
- ear - Finally the EAR.

## How to create a project?

CLI:

    mvn archetype:generate \
        -DarchetypeGroupId=walkingdevs \
        -DarchetypeArtifactId=tomee-ear \
        -DarchetypeVersion=7.0 \
        -DarchetypeRepository=http://dl.bintray.com/walkingdevs/mvn \
        -DgroupId=test \
        -DartifactId=app \
        -Dversion=0.1

## Something wrong?

Let's discuss. I am very discussful guy