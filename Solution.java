class ParkingSystem {

    int big_seat;
    int medium_seat;
    int small_seat;
    public ParkingSystem(int big, int medium, int small) {
        this.big_seat = big;
        this.medium_seat = medium;
        this.small_seat = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if(big_seat == 0)
                    return false;
                this.big_seat--;
                break;
            case 2:
                if(medium_seat == 0)
                    return false;
                this.medium_seat--;
                break;
            case 3:
                if(small_seat == 0)
                    return false;
                this.small_seat--;
                break;
        }
        
        return true;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */