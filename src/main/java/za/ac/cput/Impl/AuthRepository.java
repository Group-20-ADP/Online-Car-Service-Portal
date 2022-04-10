/**Entity : AuthenticationRepository
 Author: Manasseh Barnes (218009615)
 Milestone: Repository Implementation - first deliverable
 */
package za.ac.cput.Impl;

import za.ac.cput.Entity.Authentication;
import za.ac.cput.repository.AuthIRepository;

import java.util.HashSet;
import java.util.Set;

public class AuthRepository implements AuthIRepository {

    private static AuthRepository repository = null;
    private final Set<Authentication> authDB;

    public AuthRepository(){ authDB = new HashSet<Authentication>();}

    public static AuthRepository getRepository(){
        if(repository == null) repository = new AuthRepository();
        return repository;
    }

    @Override
    public Authentication create(Authentication authentication) {
        boolean success = authDB.add(authentication);
        if (!success) return null;
        return authentication;
    }

    @Override
    public Authentication update(Authentication authentication) {
        Authentication update_auth = read(authentication.getAuthID());
        if (update_auth != null) {
            authDB.remove(update_auth);
            authDB.add(authentication);
            return authentication;
        }
        return null;
    }

    @Override
    public Authentication read(String authID) {
        return authDB.stream()
                .filter(auth -> auth.getAuthID() == authID)
                .findAny()
                .orElse(null);
    }

    @Override
    public boolean delete(String authID) {
        Authentication delete_auth = read(authID);
        if (authID == null)
            return false;

        authDB.remove(delete_auth);
        return true;
    }

    @Override
    public Set<Authentication> getAll() {
        return authDB;
    }
}
