# chart

## 1주차: 개발환경 구성
 
 1) Github 계정 생성 (O)
 
 2) Visual Studio Code 설치 (O)
 
 3) jquery, plotly 다운로드 (O)
 
 4) JDK/Tomcat/mybatis Eclipse 설치 (O)
 
 5) mybatis 설치 (O)

- root-context.xml 37번째 줄 오류(The prefix "context" for element "context:component-scan" is not bound.)

: <beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	 https://www.springframework.org/schema/beans/spring-beans-3.0.xsd
	 http://www.springframework.org/schema/context
	 http://www.springframework.org/schema/context/spring-context-3.0.xsd">

