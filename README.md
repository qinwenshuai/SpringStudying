# SpringStudying
java、Spring学习心得及代码。有更详细资料，可给我发邮件索取：18336136677@163.com

Spring提供了一站式解决方案
	1） Spring Core  spring的核心功能： IOC容器, 解决对象创建及依赖关系
	2） Spring Web  Spring对web模块的支持。
						- 可以与struts整合,让struts的action创建交给spring
					    - spring mvc模式
	3） Spring DAO  Spring 对jdbc操作的支持  【JdbcTemplate模板工具类】
	4） Spring ORM  spring对orm的支持： 
						 既可以与hibernate整合，【session】
						 也可以使用spring的对hibernate操作的封装
	5）Spring AOP  切面编程
	6）Spring JEE   spring 对javaEE其他模块的支持(EJB)


bean对象创建细节
	 1) 对象创建： 单例/多例
	 scope="singleton", 默认值， 即默认是单例	【service/dao/工具类】
	 scope="prototype", 多例； 				【Action对象】
	 2) 什么时候创建?
	 scope="prototype"  在用到对象的时候，才创建对象。
	 scope="singleton"  在启动(容器初始化之前)， 就已经创建了bean，且整个应用只有						  一个。
	 3)是否延迟创建
	 lazy-init="false"  默认为false,  不延迟创建，即在启动时候就创建对象
	 lazy-init="true"   延迟初始化， 在用到对象的时候才创建对象(只对单例有效)
	 4) 创建对象之后，初始化/销毁
	 init-method="init_user"       【对应对象的init_user方法，在对象创建爱之后执行 】
	 destroy-method="destroy_user"  【在调用容器对象的destroy方法时候执行】



6.	创建对象方式
		SpringIOC容器，是spring核心内容。
		作用: 创建对象并处理对象的依赖关系
		IOC容器创建对象：(使用了反射)
	创建对象, 有几种方式：
	1） 调用无参数构造器
	2） 带参数构造器
	3） 工厂创建对象
			工厂类，静态方法创建对象
			工厂类，非静态方法创建对象


5)	注解
		注解方式可以简化spring的IOC容器的配置!
		使用注解步骤：
		1）先引入context名称空间
		xmlns:context="http://www.springframework.org/schema/context"
		2）开启注解扫描
	<context:component-scan base-package="cn.atcast.anno"></context:component-scan>
	3）使用注解
		通过注解的方式，把对象加入ioc容器。
	    创建对象以及处理对象依赖关系，相关的注解：
		@Component   指定把一个对象加入IOC容器
@Repository   作用同@Component； 在持久层使用
@Service      作用同@Component； 在业务逻辑层使用
@Controller    作用同@Component； 在控制层使用 
@Resource     属性注入 byName
@Autowired    属性注入 byType
