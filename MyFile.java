/**
 * id - the id of the object
 * name - the name of the file
 * data - the file data
 * fileExtension - the file extension
 *
 */

public class MyFile {

    private int id;
    private String name;
    private byte[] data;
    private String fileExtension;

    public MyFile(int id, String name, byte[] data, String fileExtension) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.fileExtension = fileExtension;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte[] getData() {
        return data;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    // @Override
    // public String toString() {
    // return id + " " + name + " " + fileExtension;
    // }
    // @Override
    // public String toString() {
    // StringBuilder sb = new StringBuilder();
    // sb.append("ID: ").append(id).append(" ");
    // sb.append("Name: ").append(name).append(" ");
    // sb.append("File Extension: ").append(fileExtension).append(" ");
    // sb.append("Data Length: ").append(data.length); // Print the length of the
    // data array
    // return sb.toString();
    // }
    @Override
    public String toString() {
        return "File ID: " + id + ", Name: " + name + ", Extension: " + fileExtension + ", Size: " + data.length
                + " bytes";
    }

}