package br.com.designpatterns.template_method;

public class LuxuryVehicleRepairServiceWithTemplateMethod extends VehicleRepairService {
    private final VehicleToRepair vehicleToRepair;

    public LuxuryVehicleRepairServiceWithTemplateMethod(VehicleToRepair vehicleToRepair) {
        this.vehicleToRepair = vehicleToRepair;
    }


    @Override
    protected boolean shouldRepair() {
        return vehicleToRepair.getPercentageDamage()<=50;
    }
}
