# VirtualAPKDemo
didi VirtualAPK 项目集成demo

#构建宿主命令

- cd VirtualAPKDemo
- ./gradlew clean assembleRelease
-  adb install app/build/outputs/apk/release/app-release.apk

# 构建插件并将插件推送到手机sd卡的根目录
cd PluginDemo
./gradlew clean assemblePlugin
adb push plugindemo/build/outputs/apk/release/plugindemo-release.apk /sdcard/PluginSub.apk

# andorid Q(API29)
- Android Q 如果将见插件放到sd中会提示权限错误
 ```
    Android 10 Unable to open '/storage/emulated/0/: Permission denied
 ```
 - 在Android10 中读取sd卡数据时候报这样的错，起初一脸懵逼，权限也加了为什么还报没有权限。这里是Android的新机制，每个应用只能访问如下路径：

```
    /storage/emulated/0/Android/data/<packageName>/files

```

Note: 目前宿主项目编译签名文件会提示错误，这里只是验证VirtualAPK 开源框架的接入流程，暂时不去解决
