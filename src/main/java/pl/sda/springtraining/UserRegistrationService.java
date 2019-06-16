package pl.sda.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    UserRepository userRepository;

    public void registerUser(UserRegistrationDTO dto) {

        //todo corner of hope - check if exists

        User user = new User();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setBirthDate(dto.getBirthDate());
        user.setPesel(dto.getPesel());
        user.setPhone(dto.getPhone());
        user.setUsername(dto.getUsername());
        user.setPasswordHash(String.valueOf(dto.getPassword().hashCode()));

        UserAddress userAddress = new UserAddress();
        userAddress.setCity(dto.getCity());
        userAddress.setCountry(dto.getCountry());
        userAddress.setStreet(dto.getStreet());
        userAddress.setZipCode(dto.getZipCode());
        user.setUserAddress(userAddress);

        userRepository.save(user);

    }
}
