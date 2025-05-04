package org.example.tp3;

import org.example.tp3.user.User;
import org.example.tp3.user.UserRepository;
import org.example.tp3.user.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @Test
    public void testGetUserById() {
        // Initialize mocks
        MockitoAnnotations.openMocks(this);

        // Create test data
        User expectedUser = new User(1L, "John Doe", "john@example.com");

        // Configure mock behavior
        when(userRepository.findUserById(1L)).thenReturn(expectedUser);

        // Create service with mock repository
        UserService userService = new UserService(userRepository);

        // Call the method
        User result = userService.getUserById(1L);

        // Verify the result
        assertEquals(expectedUser, result);

        // Verify that the repository method was called with correct argument
        verify(userRepository).findUserById(1L);
    }
}