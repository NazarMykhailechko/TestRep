package annotations;

import org.junit.Test;
import service.PersonServiceImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class AnnotationService {

    @Test
    public void checkDefault() throws InvocationTargetException, IllegalAccessException {

        PersonServiceImpl personServiceImpl = new PersonServiceImpl();
        Class<?> cls = personServiceImpl.getClass();

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {

            if(method.isAnnotationPresent(DefaultValue.class)){
                DefaultValue defaultValue = method.getAnnotation(DefaultValue.class);
                method.invoke(personServiceImpl, defaultValue.name(), defaultValue.age());
            }

        }
    }
}