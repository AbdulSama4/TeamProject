package BusinessLogic;

public class Flight {

	protected String flightID;
	
	private String flightNum;
	
	private String departureDate;
	
	private String departureTime;
	
	private String arrivalTime;
	
	private String flightDuration;
	
	private String to;
	
	private String from;
	
	private String airlineName;
	
	private int capacity;
	
	private int numBooked;
	
	private String destinationAirport;
	
	private String flightPrice;
	
	private String boardingTime;

	public Flight() {}
		
	public Flight(String flightNum, String departureDate, String departureTime, String arrivalTime,
			String flightDuration, String to, String from, String airlineName, int capacity, int numBooked,
			String destinationAirport, String flight_price, String boardingTime,String flightID) {
		
		this.flightID=flightID;
		this.flightNum = flightNum;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightDuration = flightDuration;
		this.to = to;
		this.from = from;
		this.airlineName = airlineName;
		this.capacity = capacity;
		this.numBooked = numBooked;
		this.destinationAirport = destinationAirport;
		this.flightPrice = flight_price;
		this.boardingTime = boardingTime;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public String getBoardingTime() {
		return boardingTime;
	}

	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}

	public String getFlightID() {
		return flightID;
	}

	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumBooked() {
		return numBooked;
	}

	public void setNumBooked(int numBooked) {
		this.numBooked = numBooked;
	}

	public String toString() {
		System.out.println(flightID + "");
		return flightID + "";
	}

	public boolean flightCheck(String flightID) {
		if (flightID.equals(this.getFlightID())) {
			return true;
		}

		return false;

	}

	public String getFlight_price() {
		return flightPrice;
	}

	public void setFlight_price(String flight_price) {
		this.flightPrice = flight_price;
	}
	
	// Method to check if a flight has a conflicting date and time with another flight
	
	public boolean hasConflict(Flight otherFlight) {
		return this.departureDate.equals(otherFlight.getDepartureDate()) &&
                this.departureTime.equals(otherFlight.getDepartureTime());
    }
	
	// Method to increment the number of booked passengers for the flight
	
    public void incrementNumBooked() {
    	this.numBooked++;
    }
    
    // Method to decrement the number of booked passengers for the flight
    
    public void decrementNumBooked() {
    	this.numBooked = Math.max(0, this.numBooked - 1);
    }

    // Method to get the remaining capacity (seats available) for the flight
    
    public int getRemainingCapacity() {
        return capacity - numBooked;
    }
    
    // Method to check if the flight is full and cannot accommodate more passengers
    
    public boolean isFull() {
        return numBooked >= capacity;
    }
    
    // Method to book a passenger for the flight
    
    public void bookPassenger() throws Exception {
        // Check if the flight is full before booking a passenger
        if (isFull()) {
            throw new Exception("The flight is full. Cannot book more passengers.");
        }
        
     // Increment the number of booked passengers
        incrementNumBooked();
    }
        
    // Method to cancel a passenger's booking for the flight
    
    public void cancelBooking() throws Exception {
        // Check if there are booked passengers to cancel
        if (numBooked > 0) {
            // Decrement the number of booked passengers
            decrementNumBooked();
        } else {
            throw new Exception("No passengers booked for this flight.");
        }
    } 
}
