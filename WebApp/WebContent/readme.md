
index.jsp文件会在该目录下：
apache-tomcat-8.5.49/work/Catalina/localhost/ROOT/org/apache/jsp
生成index_jsp.java,index_class文件。可点击index_jsp.java查看实际代码。
<br>
配置访问路径
<servlet>
  	<servlet-name>a</servlet-name>
  	<servlet-class>com.ly.servlet</servlet-class>
  </servlet>
  <servlet-mapping>
  	<servlet-name>a</servlet-name>
  	<url-pattern>/aservlet</url-pattern>
  </servlet-mapping>