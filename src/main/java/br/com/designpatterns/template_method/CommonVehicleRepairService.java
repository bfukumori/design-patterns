package br.com.designpatterns.template_method;

public class CommonVehicleRepairService {
    private final VehicleToRepair vehicleToRepair;

    public CommonVehicleRepairService(VehicleToRepair vehicleToRepair) {
        this.vehicleToRepair = vehicleToRepair;
    }

    public void repairVehicle() {
        enterWorkshop();
        analyzeDamage();
        if(shouldRepair()) {
            repair();
            notifyInsuranceCompany();
        } else {
            notifyTotalLoss();
        }
    }

    private void notifyTotalLoss() {
        System.out.println("Notify total loss to insurance Company");
    }

    private void notifyInsuranceCompany() {
        System.out.println("Notify repair to insurance Company");
    }

    private void repair() {
        System.out.println("Repairing vehicle");
    }

    private boolean shouldRepair() {
        return vehicleToRepair.getPercentageDamage()<=70;
    }

    private void analyzeDamage() {
        System.out.println("Analyze damage");
    }

    private void enterWorkshop() {
        System.out.println("Enter workshop");
    }
}
