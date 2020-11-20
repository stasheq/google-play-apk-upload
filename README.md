# google-play-apk-upload

To compile  
```
cd ./google-play-apk-upload/
./gradlew apk_upload:installDist
```
To run. Assuming that needed files are in the same folder.   
```
cd apk_upload/build/install/apk_upload/bin
./apk_upload my.test.app.id app-release.aab api-12345.json
```
Described in details:
```
https://stasheq.medium.com/upload-apk-to-google-play-via-command-line-script-d93b0d6a28c5
```
