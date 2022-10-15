package homework9bylesson11;

public enum Planet {

    // 1. создать enum, перечисляющий 3 любые планеты солнечной системы
    MERCURY("Mercury", 3.33022, 2440), MARS("Mars", 6.4171, 3390), JUPITER("Jupiter", 18986,71492);

    private String name;
    private double mass;
    private int radius;

    Planet(String name, double mass, int radius){  //2. значения всех свойств задать через конструктор: масса, радиус и название планеты
        this.mass = mass;
        this.radius = radius;
        this.name = name;
    }

    protected void setMass(double mass){  //3. реализовать возможность изменить массу планеты
        this.mass = mass;
    }

    protected void setRadius(int radius){  //3. реализовать возможность изменить радиус планеты
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass + " 10^23kg" +
                ", radius=" + radius + " km" +
                '}';
    }
}

