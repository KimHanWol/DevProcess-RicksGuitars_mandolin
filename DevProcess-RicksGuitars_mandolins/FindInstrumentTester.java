
import java.util.List;
public class FindInstrumentTester {

  public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    Guitar whatErinLikes = new Guitar("", 0, 
    		new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 1, Wood.ALDER, Wood.ALDER));
    
    List instruments = inventory.search(new GuitarSpec(Builder.FENDER, "test", Type.ACOUSTIC,1, Wood.ALDER, Wood.ALDER));
    if (instruments != null) {
    	for(int i = 0;i<instruments.size();i++) {
    		Instrument instrument = (Instrument) instruments.get(i);
    		System.out.println("Erin, you might like this " +
    		instrument.getSpec().getBuilder() + " " + 
    		instrument.getSpec().getModel() +  " " +
    		instrument.getSpec().getType() + " guitar:\n   " +
    		instrument.getSpec().getBackWood() + " back and sides,\n   " +
    		instrument.getSpec().getTopWood() + " top.\nYou can have it for only $" +
    		instrument.getPrice() + "!");
    	}
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
    
    instruments = inventory.search(new MandolinSpec(Builder.FENDER, "test", Type.ACOUSTIC, Style.A, Wood.ALDER, Wood.ALDER));
    if (instruments != null) {
    	for(int i = 0;i<instruments.size();i++) {
    		Instrument instrument = (Instrument) instruments.get(i);
    		System.out.println("Erin, you might like this " +
    		instrument.getSpec().getBuilder() + " " + 
    		instrument.getSpec().getModel() +  " " +
    		instrument.getSpec().getType() + " Mandolin:\n   " +
    		instrument.getSpec().getBackWood() + " back and sides,\n   " +
    		instrument.getSpec().getTopWood() + " top.\nYou can have it for only $" +
    		instrument.getPrice() + "!");
    	}
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
    
    
    
  }

  private static void initializeInventory(Inventory inventory) {
	  inventory.addInstrument("111", 1, new GuitarSpec(Builder.FENDER, "test", Type.ACOUSTIC,1, Wood.ALDER, Wood.ALDER));
	  inventory.addInstrument("222", 2, new MandolinSpec(Builder.FENDER, "test", Type.ACOUSTIC, Style.A, Wood.ALDER, Wood.ALDER));
		/*
		 * inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic",
		 * "Indian Rosewood", "Sitka"); inventory.addGuitar("V95693", 1499.95, "Fender",
		 * "Stratocastor", "electric", "Alder", "Alder"); inventory.addGuitar("V9512",
		 * 1549.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		 * inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic",
		 * "Mahogany", "Adirondack"); inventory.addGuitar("76531", 6295.95, "Martin",
		 * "OM-28", "acoustic", "Brazilian Rosewood", "Adriondack");
		 * inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric",
		 * "Mahogany", "Maple"); inventory.addGuitar("82765501", 1890.95, "Gibson",
		 * "SG '61 Reissue", "electric", "Mahogany", "Mahogany");
		 * inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic",
		 * "Brazilian Rosewood", "Adirondack"); inventory.addGuitar("1092", 12995.95,
		 * "Olson", "SJ", "acoustic", "Indian Rosewood", "Cedar");
		 * inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic",
		 * "Cocobolo", "Cedar"); inventory.addGuitar("6 29584", 2100.95, "PRS",
		 * "Dave Navarro Signature", "electric", "Mahogany", "Maple");
		 */
  }
}
