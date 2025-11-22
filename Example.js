document.getElementById('registerForm').addEventListener('submit', function (e) {
    e.preventDefault();

    // Clear message
    const messageEl = document.getElementById('message');
    messageEl.textContent = '';
    messageEl.style.color = 'red';

    // Get form values
    const username = document.getElementById('username').value.trim();
    const email = document.getElementById('email').value.trim();
    const gender = document.getElementById('gender').value;
    const mobile = document.getElementById('mobile').value.trim();
    const address = document.getElementById('address').value.trim();
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;

    // Basic validation
    if (!username || !email || !password || !confirmPassword) {
        messageEl.textContent = 'Please fill in all fields.';
        return;
    }

    if (password.length < 6) {
        messageEl.textContent = 'Password must be at least 6 characters.';
        return;
    }

    if (password !== confirmPassword) {
        messageEl.textContent = 'Passwords do not match.';
        return;
    }

    // Simulate success
    messageEl.style.color = 'green';
    messageEl.textContent = 'Registration successful!';
    document.getElementById('registerForm').reset();
});

