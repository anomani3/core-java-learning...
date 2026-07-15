package ashraf.java8.features.java17.sealedClassesFeature;

public abstract sealed class  Shape permits Circle,Rectangle,Square {
            abstract void makeSound();
}
