package co.fullstacklabs.cuboid.challenge.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author JOSE230821
 *
 */

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
    private String message;
    private String details;
    
    /**
     * @author JOSE230821
     * ErrorDetails: Set the params to the error message
     *
     */
    
	/*public ErrorDetails(String message, String details) {

		this.message = message;
		this.details = details;
	}*/
    
    
}
