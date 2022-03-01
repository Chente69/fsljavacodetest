package co.fullstacklabs.cuboid.challenge.exception;

/**
 * @author José Vicente Nino R
 * @version 1.0
 * @since 2022-02-26
 */
public class DeleteErrCuboiIDNotFound extends RuntimeException {
    public DeleteErrCuboiIDNotFound(final String message) {
        super(message);
    }
}
