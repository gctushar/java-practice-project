package abstractclass;

public abstract class Car {

    String name;
    String model;
    int wheel;

    Car(String name) {

        this.name = name;
    }

    Car(int n, String model) {
        wheel = n;
        this.model = model;
    }

    public static void main(String[] args) {
        Car car = new Car("New Car") {

            @Override
            void setModel(String model) {
                System.out.println(model);
            }
        };


        car.honk();
        System.out.println(car.name);
    }

    abstract void setModel(String model);

    private void honk() {
        System.out.println("honk from car abstract");
    }
}
