Struts2整合Spring
方式一：动作类还是Struts2负责管理，只是向Spring容器要service的实例
	Demo1Action
方式二：动作类也交给Spring管理
	Demo2Action
	
整合步骤如下：
1.引入spring所需的jar包
2.配置applicationContext.xml文件
3.web.xml配置监听器
4.引入struts-spring-plugin jar包
