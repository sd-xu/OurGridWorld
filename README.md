# GridWorld 命令行初尝试

## 案例一

### 进入Runner文件夹后打开终端,键入如下指令:

```shell
    javac -cp "gridworld.jar" Runner.java -d .
    /*
    * 其中javac 用来编译.java文件,生成.class文件(jvm执行所需的文件)
    * -cp 则是指定编译Runner.java时依赖的.class文件所在位置
    * -d 则是指定生成的.class文件存放的位置
    * 其中若Runner.java 中存在package语句,javac则会将生成的.class文件存放到./${package_name}目录下
    *
    */
```

### 若看到当前目录下生成了Run文件夹以及Run/Runner.class则说明编译已成功,则可以转入下一步.

### 接下来还是在之前打开的终端中键入如下命令:

```shell
    java -cp ".;gridworld.jar" Run.Runner //windows
    java -cp ".:gridworld.jar" Run.Runner //linux
    /*
    * 其中java就是jvm,用来运行编译好的.class文件和带有main函数的jar包
    * -cp则与javac一样
    * 其中引号中的';'和':'是对不同路径的分隔符
    * 注意:
    *    若编写的.java文件中存在包名,则应在运行时指定相同的包名,且运行java指令时应在所指定包的上一级目录
    */
```

### 若成功运行则完成了此次任务

