Comento SW Dev
==============

1주차: 개발환경 구성
-------------------
 
 ###### 1. Github 계정 생성 
 
######  2. 개발 환경구축
 
 * Spring 
      + jdk 1.8, eclipse, Spring Tools 3, Tomcat 9 설치
      + pom.xml 스프링 버전 및 JDK 버전 변경, 서버 세팅
 * DataBase
      + mariaDB 10.5.4, MySQL Workbench 8.0 설치
      + Theater 스키마 생성, Movie table 생성, data 넣기
 
######  3. 스프링, MariaDB, MyBatis 연동, 데이터 조회
 * pom.xml 수정     
      + mariadb, mybatis 관련 dependency 추가    
 * root-context.xml 수정    
      + root-context.xml 37번째 줄 오류(The prefix "context" for element "context:component-scan" is not bound.)    
          - xmlns:context="http://www.springframework.org/schema/context" 작성     
 * mybatis-config.xml, logback.xml, log4jdbc.log4j2.properties, test.xml 작성    
 * dao, service, settingweb, vo 패키지 작성    
 * 데이터 조회
   

