Comento SW Dev
==============

1주차: 개발환경 구성 (20.08.06 ~ 20.08.10)
-------------------
 
 ##### 1. Github 계정 생성 
 
#####  2. 개발 환경구축
 
 * Spring 
      + jdk 1.8, eclipse, Spring Tools 3, Tomcat 9 설치
      + pom.xml 스프링 버전 및 JDK 버전 변경, 서버 세팅
 * DataBase
      + mariaDB 10.5.4, MySQL Workbench 8.0 설치
      + Theater 스키마 생성, Movie table 생성, data 넣기
 
#####  3. 스프링, MariaDB, MyBatis 연동, 데이터 조회
 * pom.xml 수정     
      + mariadb, mybatis 관련 dependency 추가    
 * root-context.xml 수정    
      + root-context.xml 37번째 줄 오류(The prefix "context" for element "context:component-scan" is not bound.)    
          - xmlns:context="http://www.springframework.org/schema/context" 작성     
 * mybatis-config.xml, logback.xml, log4jdbc.log4j2.properties, test.xml 작성    
 * dao, service, settingweb, vo 패키지 작성    
 * 데이터 조회
 
     
 2주차: 차트 테스트 및 API 인터페이스 가이드 작성 (20.08.11 ~ 20.08.17)
 ---------------------------------------------
     
##### 1. Dynamic Web Project 생성: d3test 
    
##### 2. html 파일 생성: chart_ex.html

##### 3. tsv 파일 생성: data.tsv      

##### 4. Tomcat 서버 구성: localhost:8080/d3test 로 접속     
##### 5. API 인터페이스 가이드 작성
   
3주차: Spring: RestController, DataBinding (20.08.19 ~ 20.08.24)
--------------------------------------------------
    
    ##### 1. Spring: RestController을 이용한 데이터 처리(jakson)
        
        * json 사용 위해 Jackson library 추가
            + pom.xml에 jackson 관련 library 추가 후 저장    
        * restController를 구현하기 위한 restController.java파일 작성
            + localhost:8080/settingweb/restex 로 확인    
            + List<json> 으로 movieList 값 가져옴
        
    ##### 2. DataBinding을 위한 화면 구조 변경, 자원 작성    
        * home.jsp    
            + id "load_movieList" 버튼 추가    
            + "common_resource.jsp", "home.js", "home.css" 가져올 수 있도록 <head> 태그 안에 추가    
        * common_resource.jsp, home.js, home.css, jquery-1.12.4.min.js 파일 추가    
            + home.css: 웹페이지 디자인    
            + home.js: 화면에서 동적으롤 이용    
            + jquery-1.12.4.min.js: FrontEnd 개발을 쉽게 하기위한 library    
            + common_resource.jsp: jquery-1.12.4.min.js 불러오는 파일. 공통 자원을 파일로 만들어 개발을 좀 더 빠르게 진행, 유지보수 가독성 증진    
        * servlet-context.xml 수정
            + js파일은 js폴더 아래에, css 파일은 css 폴더 아래에 있음을 명시
            
   

