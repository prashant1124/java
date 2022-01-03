# Stream
In Java, streams are the sequence of data that are read from the source and written to the destination.
An input stream is used to read data from the source. And, an output stream is used to write data to the destination.
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
Here in our HelloWorld example, we have used System.out to print a string i.e output stream

Input Stream is used to take input from the source and process in program

Types of Stream
Byte Stream
Character Stream
Byte Stream
Byte stream is used to read and write a single byte (8 bits) of data.

All byte stream classes are derived from base abstract classes called InputStream and OutputStream.

Character Stream
Character stream is used to read and write a single character of data.

All the character stream classes are derived from base abstract classes Reader and Writer.

ZIP FILE STREAM:

ZipInputStream is a Java class that implements an input stream filter for reading files in the ZIP file format. It has support for both compressed and uncompressed entries. ZIP is an archive file format that supports lossless data compression. A ZIP file may contain one or more files or directories that may have been compressed.
