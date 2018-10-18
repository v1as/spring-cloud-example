rm main-app.jar
cd ..
./gradlew clean build
cp ./build/libs/main-app-0.0.1-SNAPSHOT.jar ./docker/main-app.jar