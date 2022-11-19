# 网页api

# /getMac 获取设备Mac地址 POST {}

返回
```
{"mac":"00:db:70:03:04:03"}
```

# /login 登录 POST {"password":后台密码}

返回
```
{"page":"loginfail.html"} // 密码错误
{"page":"main.html"} // 密码正确
```

# /hardwareInfo 获取设备状态 POST {}

返回
```
{"battery":"","cpu":"","disk":"28155MB","flow":"","mem":"415\/3002MB"}
```

# /connect 获取连接信息 POST {}

返回
```
{"connect":"默认设置"}
```

# /connectClear 恢复默认连接 POST {}

返回
```
{"result":false} // 失败
{"result":true} // 成功
```

# /connectSet 修改连接信息 POST {"address":地址}

返回
```
{"result":false} // 失败
{"result":true} // 成功
```

# /engineSet TTS引擎设置 POST {"engine":引擎}

返回
```
{"result":false} // 失败
{"result":true} // 成功
```

# /dance 琥珀跳舞动画 POST {"name":动作名}

返回
```
{"result":false} // 失败
{"result":true} // 成功
```

# /speakText 朗读文本 POST {"text":文本}

返回
```
{"result":false} // 失败
{"result":true} // 成功
```

# /pause 停止跳舞动画 POST {}

返回
```
{"result":false} // 失败
{"result":true} // 成功
```
