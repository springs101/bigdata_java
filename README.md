# bigdata_java
java开发环境说明及大数据服务器部署说明

1.开发IDE:IDEA   2019.1.3


2.jdk:1.8
3.内部maven 配置
(注意修改localRepository)
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
	<localRepository>E:\maven\maven\repository</localRepository>
	<servers>
	    <server>  
			<id>releases</id>  
			<username>admin</username>  
			<password>admin123</password>  
		</server>
	</servers>

	<profiles>  
        <profile>  
            <id>zmt_nexus</id>  
            <repositories>  
                <repository>  
                    <id>nexus</id>  
                    <name>Nexus</name>  
                    <url>http://192.168.86.8:8081/nexus/content/groups/public/</url>  
                    <releases>  
                        <enabled>true</enabled>  
                    </releases>  
                    <snapshots>  
                        <enabled>true</enabled>  
                    </snapshots>  
                </repository>  
            </repositories>  
            <pluginRepositories>  
                <pluginRepository>  
                    <id>nexus</id>  
                    <name>Nexus</name>  
                    <url>http://192.168.86.8:8081/nexus/content/groups/public/</url>  
                    <releases>  
                        <enabled>true</enabled>  
                    </releases>  
                    <snapshots>  
                        <enabled>true</enabled>  
                    </snapshots>  
                </pluginRepository>  
            </pluginRepositories>  
        </profile>  
    </profiles>  
    <activeProfiles>  
        <activeProfile>zmt_nexus</activeProfile>  
    </activeProfiles>  
	
</settings>


4.java开发框架
  本工程选用spring boot,mybatis框架,mybatis部分选择使用姿美汇app工具生成mappers和dao.
  工具库:
  <dependency>
   <groupId>com.simeitol.tools.mybatis.generator</groupId>
   <artifactId>simeitol-tools-mybatis-generator</artifactId>
   <version>1.2.6</version>
   <exclusions>
      <exclusion>
         <groupId>mysql</groupId>
         <artifactId>mysql-connector-java</artifactId>
      </exclusion>
      <exclusion>
         <groupId>org.springframework</groupId>
         <artifactId>spring-web</artifactId>
      </exclusion>
      <exclusion>
         <groupId>org.mybatis</groupId>
         <artifactId>mybatis</artifactId>
      </exclusion>
      <exclusion>
         <groupId>org.springframework</groupId>
         <artifactId>spring-context</artifactId>
      </exclusion>
      <exclusion>
         <groupId>org.slf4j</groupId>
         <artifactId>slf4j-api</artifactId>
      </exclusion>
   </exclusions>
</dependency>

生成的执行脚本
package com.serverBigdata.api.bigdata;

import com.greedystar.generator.application.GeneratorMain;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        GeneratorMain g1 = new GeneratorMain(
                //数据库连接
                "jdbc:mysql://114.55.187.143:4000/asterdata?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false&nullCatalogMeansCurrent=true",
                //账号
                "tidb_write",
                //密码
                "CrEoKHe5n-qVjQ9vFa#n0Y",
                //包名
                "com.serverBigdata.api",
                //作者
                "jishuai",
                //表名
                "u_user",
                //生成的实体类名
                "User");
        g1.single();

    }
}
要使用工具应当先在pom文件中加入依赖,然后在application文件同目录下增加main.java文件,并加入脚本代码运行后生成所对应表的mapper文件.

工程目录说明


bigdata目录:放置应用程序
controller目录:控制文件目录(根据mvc结构),一般对外接口都在这目录.
dao 目录:数据层存放访问数据库接口
entity 目录: 实体类(mybatis返回值)
service 目录: 数据库服务


