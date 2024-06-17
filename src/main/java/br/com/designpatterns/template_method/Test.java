package br.com.designpatterns.template_method;

public class Test {
    public static void main(String[] args) {

        System.out.println("--- LUXURY ---");
        VehicleToRepair luxuryVehicle = new VehicleToRepair();
        luxuryVehicle.setPercentageDamage(49);

        LuxuryVehicleRepairService luxuryVehicleRepairService = new LuxuryVehicleRepairService(luxuryVehicle);

        luxuryVehicleRepairService.repairVehicle();

        System.out.println("--- COMMON ---");
        VehicleToRepair commonVehicle = new VehicleToRepair();
        commonVehicle.setPercentageDamage(71);

        CommonVehicleRepairService commonVehicleRepairService = new CommonVehicleRepairService(commonVehicle);

        commonVehicleRepairService.repairVehicle();

        System.out.println("--- LUXURY WITH TEMPLATE METHOD ---");
        VehicleToRepair luxuryVehicle2 = new VehicleToRepair();
        luxuryVehicle2.setPercentageDamage(49);

        VehicleRepairService luxuryVehicleRepairService2 = new LuxuryVehicleRepairServiceWithTemplateMethod(luxuryVehicle);

        luxuryVehicleRepairService2.repairVehicle();

        System.out.println("--- COMMON WITH TEMPLATE METHOD ---");
        VehicleToRepair commonVehicle2 = new VehicleToRepair();
        commonVehicle2.setPercentageDamage(71);

        VehicleRepairService commonVehicleRepairService2 = new CommonVehicleRepairServiceWithTemplateMethod(commonVehicle);

        commonVehicleRepairService2.repairVehicle();
    }
}
