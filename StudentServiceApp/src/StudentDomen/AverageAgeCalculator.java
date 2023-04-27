package StudentDomen;


import java.util.List;

public class  AverageAgeCalculator<T extends User>   {
    private List<T> userList;

    public AverageAgeCalculator(List<T> userList) {
        this.userList = userList;
    }

    public double calculateAverageAge() {
        int totalAge = 0;
        double averageAge = 0;
        for (T user : userList) {
            totalAge += user.getAge();
        }
        averageAge =  totalAge /(double) userList.size();
        return averageAge;
    }

    


}
