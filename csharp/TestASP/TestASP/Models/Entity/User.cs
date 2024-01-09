using System;
using System.ComponentModel.DataAnnotations;

namespace TestASP.Models.Entity
{
    public class User
    {
        public User()
        {
        }

        [Required]
        public int Id { get; set; }

        [Required]
        public string FirstName { get; set; } = "";

        [Required]
        public string LastName { get; set; } = "";

        [Required]
        public string Email { get; set; } = "";

        [Required]
        public string Password { get; set; } = "";
    }
}

