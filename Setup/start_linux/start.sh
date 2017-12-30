#!/bin/sh

echo building IPPR2016
../../ConfigurationService/gradlew build
../../EventLogger/gradlew build
../../ExternalCommunicator/gradlew build
../../Gateway/gradlew build
../../GUI/gradlew build
../../GUI-dev/gradlew build
../../ModellingPlatform/gradlew build
../../ModellingPlatform-dev/gradlew build
../../ProcessEngine/gradlew build
../../ProcessModelStorage/gradlew build
../../ServiceDiscovery/gradlew build


echo Start Services
java -jar ../../ConfigurationService/build/libs/*.jar&
java -jar ../../EventLogger/build/libs/*.jar&
java -jar ../../ExternalCommunicator/build/libs/*.jar&
java -jar ../../Gateway/build/libs/*.jar&
java -jar ../../GUI/build/libs/*.jar&
#java -jar ../../GUI-dev/build/libs/*.jar&
java -jar ../../ModellingPlatform/build/libs/*.jar&
#java -jar ../../ModellingPlatform-dev/build/libs/*.jar&
java -jar ../../ProcessEngine/build/libs/*.jar&
java -jar ../../ProcessModelStorage/build/libs/*.jar&
java -jar ../../ServiceDiscovery/build/libs/*.jar&

echo ##########################################################
