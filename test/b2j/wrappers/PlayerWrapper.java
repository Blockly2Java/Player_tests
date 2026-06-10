package b2j.wrappers;

import io.github.valentinherrmann.levenshtein.ClassWrapper;
import io.github.valentinherrmann.levenshtein.MethodWrapper;

import org.junit.platform.commons.util.ReflectionUtils;

import de.tum.in.test.api.util.ReflectionTestUtils;
import io.github.valentinherrmann.levenshtein.AttributeWrapper;
import io.github.valentinherrmann.levenshtein.ConstructorWrapper;
import io.github.valentinherrmann.levenshtein.GenericClassWrapper;

public class PlayerWrapper<T> extends ClassWrapper<T>
{
    private AttributeWrapper<T, ?> x;
    private AttributeWrapper<T, ?> y;

    private MethodWrapper<T, ?> act;
    private MethodWrapper<T, ?> getX;
    private MethodWrapper<T, ?> getY;

    /*
    private AttributeWrapper<T, ?> speedX;
    private AttributeWrapper<T, ?> speedY;
    private ConstructorWrapper<T> constructor;
    private MethodWrapper<T, ?> getSpeedX;
    private MethodWrapper<T, ?> getSpeedY;
     */
    
    
    public PlayerWrapper()
    {
        super(
            "Player",
                "",
            "public"
        );
    
        x = new AttributeWrapper<>(
                this,
                "x",
                double.class,
                "private"
        );
    
        y = new AttributeWrapper<>(
                this,
                "y",
                double.class,
                "private"
        );
    
    
        act = new MethodWrapper<>(
                this,
                "act",
                void.class,
                "public"
        );
        getX = new MethodWrapper<>(
                this,
                "getX",
                double.class,
                "public"
        );
        getY = new MethodWrapper<>(
                this,
                "getY",
                double.class,
                "public"
        );
    
        /*
        speedX = new AttributeWrapper<>(
                this,
                "speedX",
                double.class,
                "private"
        );
        speedY = new AttributeWrapper<>(
                this,
                "speedY",
                double.class,
                "private"
        );
        constructor = new ConstructorWrapper<>(
                this,
                new Class<?>[]{ double.class, double.class },
                "public"
        );
        getSpeedX = new MethodWrapper<>(
                this,
                "getSpeedX",
                double.class,
                "public"
        );
        getSpeedY = new MethodWrapper<>(
                this,
                "getSpeedY",
                double.class,
                "public"
        );
         */
    }

    @Override
    public Object getObj(boolean forceNew, boolean useByteBuddy) {
        return getObj(forceNew, useByteBuddy, null);
    }

    public Object getObj() {
        return getObj(false, true);
    }


    public AttributeWrapper<T, ?> x() {
        return x;
    }

    public AttributeWrapper<T, ?> y() {
        return y;
    }

    public AttributeWrapper<T, ?> speedX() {
        return speedX;
    }

    public AttributeWrapper<T, ?> speedY() {
        return speedY;
    }

    public ConstructorWrapper<T> constructor() {
        return constructor;
    }

    public MethodWrapper<T, ?> act() {
        return act;
    }

    public MethodWrapper<T, ?> getX() {
        return getX;
    }

    public MethodWrapper<T, ?> getY() {
        return getY;
    }

    public MethodWrapper<T, ?> getSpeedX() {
        return getSpeedX;
    }

    public MethodWrapper<T, ?> getSpeedY() {
        return getSpeedY;
    }
}
