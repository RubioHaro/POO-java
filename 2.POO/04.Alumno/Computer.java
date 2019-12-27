public class Computer {

    private int size;
    private int processor;

    private String name;
    private String color;
    private String material;
    private String text;

    private boolean is_energized;
    private int voltage = 10;

    public Computer() {
        this.size = 0;
        this.processor = 4;
        this.name = "Computer";
        this.color = "White";
        this.material = "Carcaza templada con fibra de carbono";
        this.text = "HP iCore7, 5 RAM";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the voltage
     */
    public int getVoltage() {
        return voltage;
    }

    /**
     * @param voltage the voltage to set
     */
    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the processor
     */
    public int getProcessor() {
        return processor;
    }

    /**
     * @param processor the processor to set
     */
    public void setProcessor(int processor) {
        this.processor = processor;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the is_energized
     */
    public boolean isIs_energized() {
        return is_energized;
    }

    /**
     * @param is_energized the is_energized to set
     */
    public void setIs_energized(boolean is_energized) {
        this.is_energized = is_energized;
    }

    /**
     * @param overload to BreakDown (only if @param overload is less than voltage )
     * @return the BreakDonw Status (true or false)
     */
    public boolean BreakDown(int overload) {
        if (overload > this.voltage) {
            this.is_energized = false;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param overload to BreakDown (only if{@value overload} is less than voltage )
     * @return the BreakDonw Status (true or false)
     */
    public boolean useEnergy(Boolean energy) {
        this.is_energized = energy;

        /*
         * the original sentence: if (this.is_energized) { return true; } else { return
         * false; }
         */

        // simplest form.
        return this.is_energized;
    }

}