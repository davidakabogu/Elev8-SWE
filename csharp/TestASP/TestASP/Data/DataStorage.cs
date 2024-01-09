using System;
using TestASP.Models.Entity;

namespace TestASP.Data
{
	public class DataStorage
	{
		public DataStorage()
		{
		}
        public static List<User> Users { get; set; } = new List<User>();
	}
}

