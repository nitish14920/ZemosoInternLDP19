package withoutsolid.lsp;

public abstract class Salary {
    double basic_salary;
    public abstract double House_Rent_Allowance();
    public abstract double Conveyance_Allowance();
    public abstract double Lunch_Allowance();
    public abstract double Medical_Allowance();
}
class Doctor extends Salary{

    @Override
    public double House_Rent_Allowance() {
        return 0;
    }

    @Override
    public double Conveyance_Allowance() {
        return 0;
    }

    @Override
    public double Lunch_Allowance() {
        return 0;
    }

    @Override
    public double Medical_Allowance() {
        return 0;
    }
}
class Nurse extends Salary{

    @Override
    public double House_Rent_Allowance() {
        return 0;
    }

    @Override
    public double Conveyance_Allowance() {
        return 0;
    }
    // Lunch allowance is not for nurses
    @Override
    public double Lunch_Allowance() {
        return 0;
    }

    @Override
    public double Medical_Allowance() {
        return 0;
    }
}