# 网页api

# /getMac POST {}
获取设备Mac地址

返回
```
{"mac":"00:db:70:03:04:03"}
```

# /login POST {"password":后台密码}
登录

返回
```
{"page":"loginfail.html"}
```

# /hardwareInfo POST {}
获取设备状态

返回
```
{"battery":"","cpu":"","disk":"28155MB","flow":"","mem":"415\/3002MB"}
```

# /connect POST {}
获取连接信息

返回
```
{"connect":"默认设置"}
```

# /connectClear POST {}
恢复默认连接

返回
```
{"result":false}
```

# /connectSet POST {"address":地址}
修改连接信息

返回
```
```

# /engineSet POST {"engine":引擎}
TTS引擎设置

返回
```
```

# /dance POST {"name":动作名}
琥珀跳舞动画

返回
```
```

# /speakText POST {"text":文本}
朗读文本

返回
```
```

# /pause POST {}
停止朗读

返回
```
```
