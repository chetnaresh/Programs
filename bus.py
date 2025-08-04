def bus_seat_allotment(preferences):
    booked = set()
    max_seats = 40
    window_seats = set(range(1, 11))

    for seat in preferences:
        if seat in booked:
            print(f"Seat {seat} is already booked. Rejected.")
        elif 1 <= seat <= max_seats:
            if seat in window_seats:
                booked.add(seat)
                print(f"Window seat {seat} booked.")
            else:
                # Try to assign a free window seat first
                free_window = sorted(window_seats - booked)
                if free_window:
                    booked.add(free_window[0])
                    print(f"Preferred seat {seat} skipped. Window seat {free_window[0]} booked instead.")
                else:
                    booked.add(seat)
                    print(f"Seat {seat} booked.")
        else:
            print(f"Seat {seat} is invalid.")

# Example
bus_seat_allotment([5, 12, 5, 15, 3])
# Output: 
# Window seat 5 booked.
# Window seat 1 booked instead of 12 (if 1 is free)
# Seat 5 already booked. Rejected.
