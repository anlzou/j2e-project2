chcp 65001

@echo on
set add_path = ""
echo Java环境变量设置
set java_home=D:\Program Files\Java\jdk1.8.0_40
setx JAVA_HOME "%java_home%" /M
setx ClassPath ".;%java_home%\lib\dt.jar;%java_home%\lib\tools.jar" /M
set add_path=%add_path%;%java_home%\bin


echo 设置Path
setx Path "%Path%%add_path%" /M

echo 设置成功！！！！！！！！！！
pause