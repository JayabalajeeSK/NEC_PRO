public class BitOperations 
{

    public static void main(String[] args) 
    {
        int num = 5;  // Binary: 0101

        int pos = 1;  // Let's work on bit at position 1 (from right)

        // 1. Set the bit
        int setBit = num | (1 << pos);
        System.out.println("Set Bit  : " + setBit);  // 0101 | 0010 = 0111 = 7

        // 2. Clear the bit
        int clearBit = num & ~(1 << pos);
        System.out.println("Clear Bit: " + clearBit); // 0101 & ~(0010) = 0101 & 1101 = 0101 = 5

        // 3. Toggle the bit
        int toggleBit = num ^ (1 << pos);
        System.out.println("Toggle Bit: " + toggleBit); // 0101 ^ 0010 = 0111 = 7

        // 4. Get the bit (Check if bit is 1 or 0)
        int getBit = (num >> pos) & 1;
        System.out.println("Get Bit  : " + getBit); // (0101 >> 1) = 0010 → & 1 = 0
    }
}
// Set Bit  : 7
// Clear Bit: 5
// Toggle Bit: 7
// Get Bit  : 0