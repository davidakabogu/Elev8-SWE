using System;
using TestASP.Models.Entity;

namespace TestASP.Models.ViewModel
{
	public class UserToAddViewModel
	{
		public UserToAddViewModel()
		{
		}
        public string FirstName { get; set; } = "";
        public string LastName { get; set; } = "";
        public string Email { get; set; } = "";
        public string Password { get; set; } = "";
        public List<User> Users { get; set; } = new List<User>();
    }
}
