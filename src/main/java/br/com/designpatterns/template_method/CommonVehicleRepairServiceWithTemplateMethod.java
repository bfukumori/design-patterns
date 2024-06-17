package br.com.designpatterns.template_method;

public class CommonVehicleRepairServiceWithTemplateMethod extends VehicleRepairService{
    private final VehicleToRepair vehicleToRepair;

    public CommonVehicleRepairServiceWithTemplateMethod(VehicleToRepair vehicleToRepair) {
        this.vehicleToRepair = vehicleToRepair;
    }

    @Override
    protected boolean shouldRepair() {
        return vehicleToRepair.getPercentageDamage()<=70;
    }
}
