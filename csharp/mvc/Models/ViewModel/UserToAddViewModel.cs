using System;
namespace mvc.Models.ViewModel
{
    public class UserToAddViewModel
    {
        public string FirstName { get; set; } = "";
        public string LastName { get; set; } = "";
        public string Email { get; set; } = "";
        public string Password { get; set; } = "";
    }
}
