(1) Bean Configuration: 
        The <bean> tag in country.xml defines a Country bean with id="country" and class="com.cognizant.spring_learn.Country".
        The <property> tags set the code and name fields using their respective setters.
        The value attribute directly assigns literal values (IN, India).

(2) ApplicationContext and ClassPathXmlApplicationContext:
        ApplicationContext is the Spring IoC container that manages beans.
        ClassPathXmlApplicationContext loads bean definitions from country.xml in the classpath (src/main/resources).
        It initializes beans when the context is created or when getBean() is called.

(3) context.getBean():
        Looks up the bean by ID (country).
        Instantiates the Country class (logs constructor).
        Injects properties via setters (logs setCode, setName).
        Returns the bean, which is logged via toString().
