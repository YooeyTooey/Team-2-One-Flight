document.addEventListener('DOMContentLoaded', function() {
    const activateBtn = document.getElementById('activateBtn');
    const deactivateBtn = document.getElementById('deactivateBtn');
  
    activateBtn.addEventListener('click', function() {
      const selectedRole = document.getElementById('userRole').value;
      activateUser(selectedRole);
    });
  
    deactivateBtn.addEventListener('click', function() {
      const selectedRole = document.getElementById('userRole').value;
      deactivateUser(selectedRole);
    });
  
    function activateUser(role) {
      // logic for activation
      console.log(`Activating ${role} user...`);
      // user activation based on role
    }
  
    function deactivateUser(role) {
      // logic for deactivation
      console.log(`Deactivating ${role} user...`);
      // user deactivation based on role
    }
  });  