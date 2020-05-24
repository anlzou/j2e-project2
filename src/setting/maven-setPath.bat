chcp 65001

@echo on
set add_path = ""

echo Maven环境变量设置
set maven_home=F:\anlzou-do-not-delete\apache-maven-3.6.3
setx Maven_HOME "%maven_home%" /M
set add_path=%add_path%;%maven_home%\bin

echo 设置Path
setx Path "%Path%%add_path%" /M

echo 设置成功！！！！！！！！！！
pause